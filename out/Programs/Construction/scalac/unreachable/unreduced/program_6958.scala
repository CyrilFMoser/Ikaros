package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: Int) extends T_A[T_B[T_B[Int]]]
case class CC_B() extends T_A[T_B[T_B[Int]]]
case class CC_C(a: T_A[T_B[Char]], b: CC_B) extends T_A[T_B[T_B[Int]]]
case class CC_D[C, D]() extends T_B[C]

val v_a: T_A[T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}