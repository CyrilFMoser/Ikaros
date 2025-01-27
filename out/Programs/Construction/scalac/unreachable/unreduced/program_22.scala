package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[T_B[T_A[Byte, Boolean]], T_A[T_A[(Boolean,Char), Byte], T_A[Int, Boolean]]]
case class CC_B(a: CC_A[T_B[Char]], b: T_A[T_A[Int, Char], T_A[Byte, Boolean]], c: T_B[Byte]) extends T_A[T_B[T_A[Byte, Boolean]], T_A[T_A[(Boolean,Char), Byte], T_A[Int, Boolean]]]
case class CC_C[E, F](a: CC_A[E], b: CC_A[E]) extends T_A[E, F]
case class CC_D(a: T_A[T_A[CC_B, CC_B], (CC_B,(Boolean,Byte))]) extends T_B[T_A[T_A[CC_B, Boolean], CC_A[(Byte,Char)]]]
case class CC_E(a: T_B[T_B[CC_B]], b: Boolean, c: T_A[CC_A[CC_B], CC_B]) extends T_B[T_A[T_A[CC_B, Boolean], CC_A[(Byte,Char)]]]

val v_a: T_A[T_B[T_A[Byte, Boolean]], T_A[T_A[(Boolean,Char), Byte], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, CC_A(_)) => 1 
}
}
// This is not matched: CC_B(CC_A(_), CC_C(_, _), _)