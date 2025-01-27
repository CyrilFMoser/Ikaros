package Program_31 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, E], b: T_A[E, C]) extends T_A[C, D]
case class CC_B[G, F, H]() extends T_A[F, G]
case class CC_C[I](a: (Byte,(Char,Int)), b: Char) extends T_A[I, CC_B[I, I, I]]

val v_a: CC_A[Char, Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_A(_, _), _) => 1 
  case CC_A(_, CC_A(_, _)) => 2 
  case CC_A(_, CC_B()) => 3 
  case CC_A(CC_B(), CC_A(_, _)) => 4 
}
}
// This is not matched: (CC_A Char
//      Byte
//      Char
//      (CC_B Char
//            Char
//            (T_A (T_A Boolean (T_A Boolean Boolean)) Boolean)
//            (T_A Char Char))
//      (CC_B Char Char (T_A Boolean Boolean) (T_A Char Char))
//      (T_A Char Byte))
// This is not matched: (CC_C Byte Int (T_A Byte Int))