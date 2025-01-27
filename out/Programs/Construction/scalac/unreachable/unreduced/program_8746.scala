package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Byte, T_A[Boolean, (Boolean,Char)]]) extends T_A[Boolean, T_A[T_A[Char, Boolean], T_A[Byte, Char]]]
case class CC_B[C]() extends T_A[Boolean, C]
case class CC_C[D](a: CC_B[Int], b: T_A[Boolean, D]) extends T_A[Boolean, D]

val v_a: T_A[Boolean, T_A[T_A[Char, Boolean], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(_)) => 2 
  case CC_C(_, CC_C(_, _)) => 3 
}
}
// This is not matched: CC_C(_, CC_B())