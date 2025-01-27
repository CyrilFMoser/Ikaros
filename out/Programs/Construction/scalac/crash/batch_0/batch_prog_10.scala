package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B(a: T_A[T_A[Boolean]], b: CC_A[Int], c: Boolean) extends T_A[Char]
case class CC_C[C]() extends T_A[C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C() => 1 
}
}