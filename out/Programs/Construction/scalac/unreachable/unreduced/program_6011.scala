package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Char]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[T_A[Boolean]], b: (Boolean,T_A[CC_A])) extends T_A[Boolean]
case class CC_C[B]() extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}