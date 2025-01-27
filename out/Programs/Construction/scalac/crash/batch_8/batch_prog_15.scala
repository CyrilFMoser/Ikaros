package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C[D](a: Boolean, b: (T_A[Boolean],Int), c: (Boolean,Int)) extends T_A[D]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}