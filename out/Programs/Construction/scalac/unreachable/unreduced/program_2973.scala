package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[Char], b: T_B[T_A[CC_A]], c: CC_A) extends T_A[T_A[T_A[Char]]]
case class CC_C[C](a: T_A[C], b: T_B[C], c: T_B[C]) extends T_A[C]
case class CC_D(a: Int) extends T_B[Byte]
case class CC_E() extends T_B[Byte]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_C(_, _, _), _, CC_A()) => 1 
  case CC_C(_, _, _) => 2 
}
}