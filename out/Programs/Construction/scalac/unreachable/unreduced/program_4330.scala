package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[T_A, (Byte,Int)]]) extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_B[C, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}