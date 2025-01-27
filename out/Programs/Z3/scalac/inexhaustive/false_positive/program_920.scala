package Program_30 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[D], b: E) extends T_A[D]
case class CC_B[F](a: T_A[Char], b: T_A[F], c: CC_A[F, F]) extends T_A[F]
case class CC_C(a: Char, b: (Boolean,Char), c: T_A[Byte]) extends T_A[T_A[Char]]
case class CC_D[G](a: CC_A[G, G], b: T_B[G, G], c: T_B[Boolean, G]) extends T_B[CC_A[CC_C, CC_C], G]

val v_a: CC_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), 12) => 0 
  case CC_A(CC_B(_, _, _), _) => 1 
  case CC_A(_, 12) => 2 
  case CC_A(CC_A(_, _), _) => 3 
}
}
// This is not matched: (CC_A Char
//      Int
//      (CC_A Char Boolean Wildcard Wildcard (T_A Char))
//      Wildcard
//      (T_A Char))
// This is not matched: Pattern match is empty without constants