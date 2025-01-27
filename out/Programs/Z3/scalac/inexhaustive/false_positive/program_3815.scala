package Program_14 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, D]) extends T_A[D, C]
case class CC_B[F](a: CC_A[F, F, F], b: CC_A[F, F, F], c: ((Int,Boolean),(Int,Byte))) extends T_A[F, T_A[Char, Boolean]]
case class CC_C() extends T_A[CC_A[Byte, Byte, Int], T_A[Char, Boolean]]

val v_a: CC_A[Char, Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Char
//      Int
//      Char
//      (CC_A Int
//            Char
//            Boolean
//            (CC_A Char Boolean Boolean Wildcard (T_A Boolean Char))
//            (T_A Char Int))
//      (T_A Int Char))
// This is not matched: Pattern match is empty without constants