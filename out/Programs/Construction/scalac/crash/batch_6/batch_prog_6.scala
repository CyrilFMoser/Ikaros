package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Boolean, Char], (Boolean,(Int,Boolean))]) extends T_A[T_B[T_B[Int, Int], T_B[Int, Boolean]]]
case class CC_B[D](a: T_A[D]) extends T_B[D, Byte]

val v_a: T_A[T_B[T_B[Int, Int], T_B[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}