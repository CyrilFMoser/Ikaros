package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: (T_A[Byte, Byte],T_A[Boolean, Char])) extends T_A[Boolean, C]
case class CC_B[D]() extends T_A[Boolean, D]
case class CC_C[E](a: CC_B[E]) extends T_A[Boolean, E]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_A(_, _))) => 0 
  case CC_A(_, (_,CC_B())) => 1 
  case CC_A(_, (_,CC_C(_))) => 2 
  case CC_B() => 3 
  case CC_C(_) => 4 
}
}