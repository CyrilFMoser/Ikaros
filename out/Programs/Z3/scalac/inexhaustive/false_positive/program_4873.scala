package Program_10 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[Char], b: T_B[E, E]) extends T_A[Char]
case class CC_C[F](a: CC_B[F]) extends T_B[Int, F]
case class CC_D(a: (Boolean,(Boolean,Char)), b: CC_B[Boolean], c: CC_A[Boolean]) extends T_B[Int, T_A[Char]]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_B Char
//      (CC_B Int
//            (CC_A Char Char Wildcard (T_A Char))
//            (CC_C Int (CC_B Int Wildcard Wildcard (T_A Char)) (T_B Int Int))
//            (T_A Char))
//      Wildcard
//      (T_A Char))
// This is not matched: (CC_B (CC_A Wildcard Wildcard T_A) Wildcard Wildcard T_A)