package Program_30 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: T_A[E, Boolean], b: T_B[D], c: F) extends T_A[D, E]
case class CC_B[G](a: T_A[G, G], b: G) extends T_A[CC_A[G, G, Boolean], G]
case class CC_C() extends T_A[CC_A[CC_A[Byte, Byte, Boolean], CC_A[Byte, Byte, Boolean], Boolean], CC_A[Byte, Byte, Boolean]]
case class CC_D(a: CC_C) extends T_B[CC_B[CC_C]]

val v_a: T_A[Boolean, T_A[CC_A[CC_A[Byte, Byte, Boolean], CC_A[Byte, Byte, Boolean], Boolean], CC_A[Byte, Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A (T_A (CC_A (CC_A Byte Byte Boolean Boolean Boolean Boolean Boolean)
//                 (CC_A Byte Byte Boolean Boolean Boolean Boolean Boolean)
//                 Boolean
//                 (T_A Boolean Boolean)
//                 Boolean
//                 Boolean
//                 Boolean)
//           (CC_A Byte Byte Boolean Boolean Boolean Boolean Boolean))
//      Boolean
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Boolean
//           (T_A (CC_A (CC_A Byte Byte Boolean Boolean Boolean Boolean Boolean)
//                      (CC_A Byte Byte Boolean Boolean Boolean Boolean Boolean)
//                      Boolean
//                      (T_A Boolean Boolean)
//                      Boolean
//                      Boolean
//                      Boolean)
//                (CC_A Byte Byte Boolean Boolean Boolean Boolean Boolean))))
// This is not matched: (CC_A Char Wildcard (T_A Char (T_A Boolean Byte)))