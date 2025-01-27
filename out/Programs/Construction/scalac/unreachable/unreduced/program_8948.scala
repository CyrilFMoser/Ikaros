package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,Boolean), b: T_A[C, C]) extends T_A[T_A[Boolean, (Boolean,Boolean)], C]
case class CC_B[D](a: Byte, b: CC_A[D], c: Int) extends T_A[T_A[Boolean, (Boolean,Boolean)], D]
case class CC_C[E](a: CC_A[E], b: Boolean, c: CC_A[E]) extends T_A[T_A[Boolean, (Boolean,Boolean)], E]

val v_a: T_A[T_A[Boolean, (Boolean,Boolean)], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _), _) => 1 
  case CC_C(_, _, _) => 2 
}
}