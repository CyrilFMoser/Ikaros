package Program_14 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_A, b: CC_A, c: T_B[Char]) extends T_A
case class CC_D[B, C](a: T_B[CC_C], b: T_A, c: B) extends T_B[B]
case class CC_E[D]() extends T_B[D]
case class CC_F[E](a: CC_B, b: (CC_B,(Char,Boolean))) extends T_B[E]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_E() => 0 
  case CC_F(CC_B(_), (CC_B(_),(_,_))) => 1 
  case CC_F(_, (CC_B(_),(_,_))) => 2 
  case CC_D(CC_E(), CC_C(_, _, _), _) => 3 
  case CC_D(_, _, _) => 4 
  case CC_D(CC_E(), CC_A(_), CC_C(_, _, _)) => 5 
}
}
// This is not matched: (CC_D (CC_C (CC_A Wildcard T_A) Boolean (T_B Char) T_A)
//      T_A
//      (CC_D (CC_C T_A T_A T_A T_A)
//            T_A
//            Wildcard
//            (CC_B (CC_A (CC_A Wildcard T_A) T_A) T_A)
//            Wildcard
//            (T_B (CC_C T_A T_A T_A T_A)))
//      (CC_B (CC_A Wildcard T_A) T_A)
//      (CC_C (CC_A Wildcard T_A)
//            Wildcard
//            (CC_F Char Wildcard Wildcard (T_B Char))
//            T_A)
//      (T_B (CC_C (CC_A Wildcard T_A) Boolean (T_B Char) T_A)))
// This is not matched: (CC_A Int Int (CC_B Int Int (T_A Int Int)) (T_A Int Int))