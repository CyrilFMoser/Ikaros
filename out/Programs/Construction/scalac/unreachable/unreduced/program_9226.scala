package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Boolean, C]
case class CC_B[D](a: T_A[D, CC_A[D]], b: D) extends T_A[Boolean, D]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}