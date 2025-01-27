package Program_14 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_B, b: T_A[C]) extends T_A[B]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: CC_B[T_B]) extends T_B
case class CC_D(a: T_B, b: CC_B[Byte]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_A(_, _)) => 1 
  case CC_A(CC_D(_, _), CC_B()) => 2 
  case CC_A(_, _) => 3 
  case CC_A(CC_C(_), _) => 4 
  case CC_A(_, CC_B()) => 5 
}
}
// This is not matched: (CC_A T_B
//      T_B
//      (CC_C Wildcard T_B)
//      (CC_A T_B
//            T_B
//            (CC_D (CC_D (CC_C Wildcard T_B) Wildcard T_B) Wildcard T_B)
//            Wildcard
//            (T_A T_B))
//      (T_A T_B))
// This is not matched: (CC_B Char Wildcard (T_A Char))