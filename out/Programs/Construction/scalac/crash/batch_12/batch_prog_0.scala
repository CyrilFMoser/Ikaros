package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]
case class CC_B[C]() extends T_A[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}