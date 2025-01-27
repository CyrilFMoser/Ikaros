package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Char]]) extends T_A[T_A[T_B[Int]]]
case class CC_B() extends T_A[T_A[T_B[Int]]]
case class CC_C(a: T_A[T_B[Char]]) extends T_A[T_A[T_B[Int]]]
case class CC_D(a: CC_C, b: CC_B, c: CC_C) extends T_B[Char]
case class CC_E(a: T_A[T_B[Char]], b: CC_A) extends T_B[Char]
case class CC_F(a: CC_D) extends T_B[Char]

val v_a: T_A[T_A[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}