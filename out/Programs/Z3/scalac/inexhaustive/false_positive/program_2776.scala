package Program_29 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (Int,Boolean)) extends T_A[T_B[Byte, Byte]]
case class CC_B[D, E](a: T_B[E, D], b: T_B[D, CC_A]) extends T_B[D, E]
case class CC_C[F, G](a: T_A[(Char,Byte)]) extends T_B[(CC_A,Boolean), F]

val v_a: T_B[(CC_A,Boolean), Int] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_B(CC_B(_, _), CC_B(_, _)) => 1 
  case CC_B(CC_B(_, _), _) => 2 
}
}
// This is not matched: (CC_C Int Boolean Wildcard (T_B (Tuple (CC_A Boolean Boolean) Boolean) Int))
// This is not matched: (CC_A (T_A (T_A Char (Tuple Boolean Int)) (T_A Char Boolean))
//      Byte
//      Wildcard
//      (CC_A (T_A Char (Tuple Boolean Int))
//            (T_A Char Boolean)
//            Byte
//            Wildcard
//            (T_A (T_A Char (Tuple Boolean Int)) (T_A Char Boolean)))
//      (T_A (T_A (T_A Char (Tuple Boolean Int)) (T_A Char Boolean)) Byte))