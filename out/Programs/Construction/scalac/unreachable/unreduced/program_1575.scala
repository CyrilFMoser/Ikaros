package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[T_A[Byte, Int], T_A[Char, Int]], C]
case class CC_B(a: T_A[Boolean, CC_A[Boolean]], b: T_A[Boolean, CC_A[Int]]) extends T_A[T_A[T_A[Byte, Int], T_A[Char, Int]], CC_A[CC_A[Int]]]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Char, Int]], CC_A[CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_B(_, _) => 1 
}
}