package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Byte, Byte]], b: T_B[T_B[Byte, Int], T_B[Int, Boolean]], c: T_B[T_B[Byte, Char], T_B[Boolean, Char]]) extends T_A[T_B[T_A[Byte], T_A[Int]]]
case class CC_B() extends T_A[T_B[T_A[Byte], T_A[Int]]]
case class CC_C(a: Byte, b: Boolean) extends T_A[T_B[T_A[Byte], T_A[Int]]]

val v_a: T_A[T_B[T_A[Byte], T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}