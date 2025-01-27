package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Byte, b: (T_B,T_B)) extends T_A[B]
case class CC_B() extends T_A[Int]
case class CC_C(a: T_A[T_B], b: T_A[CC_B], c: Byte) extends T_A[Int]
case class CC_D[C](a: T_B, b: CC_B) extends T_B

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_A(_, (CC_D(_, _),CC_D(_, _))) => 1 
}
}
// This is not matched: (CC_A (T_A Int)
//      Wildcard
//      (Tuple (CC_D T_B
//                   (CC_D T_B Wildcard (CC_B (T_A Int)) T_B)
//                   (CC_B (T_A Int))
//                   T_B)
//             (CC_D T_B (CC_D T_B Wildcard Wildcard T_B) Wildcard T_B))
//      (T_A (T_A Int)))
// This is not matched: (CC_B Byte (T_A Byte))