package Program_31 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[CC_A, T_A]) extends T_A
case class CC_C[D, C, E](a: T_B[(Byte,Boolean), (Byte,Boolean)], b: (CC_A,CC_A), c: CC_B) extends T_B[C, D]
case class CC_D[F, G](a: G, b: CC_C[F, G, F]) extends T_B[F, G]
case class CC_E[H]() extends T_B[Char, H]

val v_a: T_B[Byte, T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_D(_, _), (CC_A(_, _),CC_A(_, _)), CC_B(_, _)) => 0 
  case CC_C(_, (CC_A(_, _),CC_A(_, _)), _) => 1 
  case CC_C(CC_C(_, _, _), _, CC_B(_, _)) => 2 
  case CC_C(CC_C(_, _, _), (CC_A(_, _),CC_A(_, _)), CC_B(_, _)) => 3 
  case CC_D(_, _) => 4 
  case CC_D(CC_B(_, _), _) => 5 
}
}
// This is not matched: (CC_C T_A
//      Byte
//      (CC_C T_A T_A T_A T_A T_A T_A (T_B T_A T_A))
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B Byte T_A))
// This is not matched: (CC_C T_A
//      Byte
//      (CC_C T_A T_A T_A T_A T_A T_A (T_B T_A T_A))
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B Byte T_A))