package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: E, b: (T_A[Byte, Char],Byte)) extends T_A[Byte, D]
case class CC_B[F](a: F, b: T_A[Byte, (Boolean,Boolean)], c: T_B[F]) extends T_A[Byte, F]
case class CC_C[G, H](a: T_A[Byte, H]) extends T_A[H, G]
case class CC_D(a: (T_A[Byte, Int],T_A[Boolean, Boolean]), b: Int) extends T_B[T_A[T_A[Byte, Char], T_A[Byte, Boolean]]]
case class CC_E(a: T_B[((Char,Int),CC_D)], b: CC_B[T_A[Byte, CC_D]], c: CC_B[T_A[Byte, CC_D]]) extends T_B[T_A[T_A[Byte, Char], T_A[Byte, Boolean]]]

val v_a: T_B[T_A[T_A[Byte, Char], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D((CC_A(_, _),CC_C(_)), _) => 0 
  case CC_D((CC_B(_, _, _),CC_C(_)), _) => 1 
  case CC_D((CC_C(_),CC_C(_)), _) => 2 
  case CC_E(_, CC_B(_, _, _), _) => 3 
}
}