package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: Byte) extends T_A[D]
case class CC_B[E](a: T_A[E], b: (T_B[Byte, (Boolean,Boolean)],Byte), c: E) extends T_A[E]
case class CC_C[F](a: Boolean) extends T_A[F]
case class CC_D[G](a: G, b: CC_B[G], c: T_A[G]) extends T_B[G, CC_B[G]]
case class CC_E(a: CC_C[CC_C[Byte]], b: Boolean, c: (T_A[Boolean],CC_D[Boolean])) extends T_B[Byte, T_B[Char, Int]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, 0), (_,_), _) => 0 
  case CC_B(CC_A(_, _), (_,_), _) => 1 
  case CC_B(CC_B(_, (_,_), _), (_,_), _) => 2 
  case CC_B(CC_C(true), (_,_), _) => 3 
  case CC_B(CC_C(false), (_,_), _) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: CC_A(_, _)