package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: E, b: T_B[F, F]) extends T_A[E, F]
case class CC_C() extends T_A[(Char,Byte), T_A[(Byte,Boolean), Char]]
case class CC_F[J]() extends T_B[J, CC_C]

val v_a: T_A[(Char,Byte), Int] = null
val v_b: Int = v_a match{
  case CC_A((_,0), _) => 0 
}
}
// This is not matched: (CC_A Byte
//      (CC_A T_A
//            (CC_B (CC_A T_A Wildcard T_A)
//                  (CC_A T_A Wildcard T_A)
//                  (CC_A (CC_A T_A T_A T_A) Wildcard T_A)
//                  T_A)
//            T_A)
//      T_A)