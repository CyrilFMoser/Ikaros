package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_B[Char]]]
case class CC_B[C](a: T_B[C], b: (T_B[CC_A],(CC_A,(Boolean,Boolean))), c: T_A[C]) extends T_A[T_B[T_B[Char]]]
case class CC_C(a: T_A[T_B[CC_A]], b: Int) extends T_A[T_B[T_B[Char]]]
case class CC_D[D](a: D) extends T_B[D]
case class CC_E[E](a: CC_C, b: Byte) extends T_B[E]

val v_a: T_A[T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,_), _) => 1 
  case CC_C(_, _) => 2 
}
}