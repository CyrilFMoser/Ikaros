package Program_31 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: Int, b: ((Char,Byte),Byte), c: E) extends T_A[E]
case class CC_C[F, G, H](a: H, b: F, c: Char) extends T_B[F, G]
case class CC_D[I](a: T_A[I], b: CC_C[I, I, I], c: CC_C[I, I, I]) extends T_B[CC_C[Byte, Int, Boolean], I]

val v_a: T_B[CC_C[Byte, Int, Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _, _), _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_, CC_C(_, _, _), CC_C(_, _, _)) => 2 
  case CC_D(_, _, _) => 3 
  case CC_D(CC_A(), CC_C(_, _, _), CC_C(_, _, _)) => 4 
  case CC_D(_, CC_C(_, _, _), _) => 5 
  case CC_D(CC_A(), _, _) => 6 
  case CC_D(CC_B(_, _, _), _, _) => 7 
  case CC_D(_, _, CC_C(_, _, _)) => 8 
  case CC_D(CC_B(_, _, _), CC_C(_, _, _), CC_C(_, _, _)) => 9 
  case CC_D(CC_A(), _, CC_C(_, _, _)) => 10 
  case CC_D(CC_B(_, _, _), _, CC_C(_, _, _)) => 11 
}
}
// This is not matched: (CC_C (CC_C Byte Int Boolean Boolean Boolean Boolean Boolean)
//      Int
//      (T_A Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (CC_C Byte Int Boolean Boolean Boolean Boolean Boolean) Int))
// This is not matched: (CC_B Char Wildcard (T_A Char))