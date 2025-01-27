package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Byte,Byte), (Boolean,Int)]) extends T_A[T_A[T_A[Char, Boolean], T_A[(Byte,Char), Char]], T_A[T_A[Boolean, Int], T_A[Char, Byte]]]
case class CC_B() extends T_A[T_A[T_A[Char, Boolean], T_A[(Byte,Char), Char]], T_A[T_A[Boolean, Int], T_A[Char, Byte]]]
case class CC_C(a: T_A[T_A[CC_B, (Int,Byte)], CC_B], b: CC_A) extends T_A[T_A[T_A[Char, Boolean], T_A[(Byte,Char), Char]], T_A[T_A[Boolean, Int], T_A[Char, Byte]]]

val v_a: T_A[T_A[T_A[Char, Boolean], T_A[(Byte,Char), Char]], T_A[T_A[Boolean, Int], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(_)) => 2 
}
}