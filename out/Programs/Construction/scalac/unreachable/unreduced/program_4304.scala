package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Char,((Int,Boolean),Byte))) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]], T_A[T_A[(Char,Boolean), (Int,Boolean)], T_A[Char, (Boolean,Byte)]]]
case class CC_B(a: T_A[T_A[CC_A, CC_A], T_A[CC_A, CC_A]]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]], T_A[T_A[(Char,Boolean), (Int,Boolean)], T_A[Char, (Boolean,Byte)]]]
case class CC_C(a: CC_A, b: CC_B, c: CC_B) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]], T_A[T_A[(Char,Boolean), (Int,Boolean)], T_A[Char, (Boolean,Byte)]]]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]], T_A[T_A[(Char,Boolean), (Int,Boolean)], T_A[Char, (Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}