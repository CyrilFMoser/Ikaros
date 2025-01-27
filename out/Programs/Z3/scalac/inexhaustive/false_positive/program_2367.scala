package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, F]) extends T_A[E, T_A[(Boolean,Byte), Int]]
case class CC_B[G, H](a: G, b: T_A[H, G]) extends T_A[G, T_A[(Boolean,Byte), Int]]
case class CC_C[I](a: Char, b: I, c: T_B[I, Byte]) extends T_A[T_B[Char, Char], I]

val v_a: T_A[Int, T_A[(Boolean,Byte), Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(12, CC_C(_, _, _)) => 1 
  case CC_B(_, _) => 2 
}
}
// This is not matched: (CC_B Int
//      (T_B Char Char)
//      Wildcard
//      (CC_C Int Wildcard Wildcard Wildcard (T_A (T_B Char Char) Int))
//      (T_A Int (T_A (Tuple Boolean Byte) Int)))
// This is not matched: (CC_B T_A)