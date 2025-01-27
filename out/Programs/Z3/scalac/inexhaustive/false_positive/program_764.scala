package Program_31 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[Int], b: T_B[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: Boolean, b: Boolean, c: T_A[Byte]) extends T_A[T_A[(Char,Byte)]]
case class CC_D[E, F]() extends T_B[E]
case class CC_E(a: CC_C, b: Byte, c: (Int,CC_C)) extends T_B[CC_A[CC_C]]
case class CC_F[G](a: G) extends T_B[CC_A[CC_C]]

val v_a: T_A[T_A[(Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
  case CC_C(_, _, CC_A(_, _)) => 2 
  case CC_A(CC_A(_, _), _) => 3 
  case CC_A(_, CC_D()) => 4 
}
}
// This is not matched: (CC_A (T_A (Tuple Char Byte))
//      (CC_B Int (T_A Int))
//      (CC_D (T_A (Tuple Char Byte)) Boolean (T_B (T_A (Tuple Char Byte))))
//      (T_A (T_A (Tuple Char Byte))))
// This is not matched: (CC_E (CC_C Boolean) Boolean (T_B (CC_C Boolean)))