package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_A[Byte],T_A[Int])) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: T_B[E]) extends T_A[E]
case class CC_D() extends T_B[CC_A[T_A[Byte]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_))) => 0 
  case CC_A((_,CC_C(_))) => 1 
  case CC_A((_,CC_B())) => 2 
  case CC_A((CC_C(_),CC_C(_))) => 3 
  case CC_B() => 4 
  case CC_C(_) => 5 
}
}