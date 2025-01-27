package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: T_A[C, C]) extends T_A[T_A[Boolean, (T_B,(Boolean,Byte))], C]
case class CC_B[D](a: (CC_A[T_B],CC_A[T_B])) extends T_A[T_A[Boolean, (T_B,(Boolean,Byte))], D]
case class CC_C[E]() extends T_A[T_A[Boolean, (T_B,(Boolean,Byte))], E]
case class CC_D(a: (CC_B[T_B],CC_B[T_B]), b: CC_C[CC_A[T_B]], c: CC_A[CC_A[T_B]]) extends T_B

val v_a: T_A[T_A[Boolean, (T_B,(Boolean,Byte))], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((CC_A(_, _),CC_A(_, _))) => 1 
  case CC_C() => 2 
}
}