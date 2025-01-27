package Program_31 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, (Boolean,Byte)]
case class CC_B[E]() extends T_A[E, (Boolean,Byte)]
case class CC_C() extends T_A[T_B[Int], (Boolean,Byte)]
case class CC_D[F](a: T_B[(Char,Int)], b: (Int,CC_C)) extends T_B[F]
case class CC_E[G, H](a: T_B[G], b: H, c: H) extends T_B[G]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_E(_, _, _), (_,CC_C())) => 0 
  case CC_D(CC_D(_, _), (_,CC_C())) => 1 
}
}
// This is not matched: (CC_D Byte
//      (CC_E (Tuple Char Int)
//            Boolean
//            (CC_E (Tuple Char Int)
//                  Boolean
//                  Wildcard
//                  Wildcard
//                  Wildcard
//                  (T_B (Tuple Char Int)))
//            Wildcard
//            Boolean
//            (T_B (Tuple Char Int)))
//      Wildcard
//      (T_B Byte))
// This is not matched: (CC_C T_A T_A)