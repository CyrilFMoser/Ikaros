package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[(Char,Boolean), (Char,Byte)], (Int,Int)], b: T_A[T_A[(Char,Char), Int], T_A[Boolean, Boolean]]) extends T_A[T_A[T_A[Byte, (Char,Char)], Boolean], T_A[T_A[Boolean, Boolean], T_A[Int, Boolean]]]
case class CC_B(a: T_A[T_A[CC_A, CC_A], (CC_A,(Boolean,Char))], b: T_A[CC_A, CC_A]) extends T_A[T_A[T_A[Byte, (Char,Char)], Boolean], T_A[T_A[Boolean, Boolean], T_A[Int, Boolean]]]
case class CC_C(a: Byte) extends T_A[T_A[T_A[Byte, (Char,Char)], Boolean], T_A[T_A[Boolean, Boolean], T_A[Int, Boolean]]]

val v_a: T_A[T_A[T_A[Byte, (Char,Char)], Boolean], T_A[T_A[Boolean, Boolean], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(0) => 2 
  case CC_C(_) => 3 
}
}