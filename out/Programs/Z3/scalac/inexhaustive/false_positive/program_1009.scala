package Program_31 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (Byte,Char), b: T_B) extends T_A[C, T_B]
case class CC_B[D](a: D, b: (T_B,T_B), c: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_C() extends T_A[T_B, T_B]
case class CC_D(a: T_A[T_B, T_B], b: T_A[T_B, T_B], c: CC_C) extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_A(_, _) => 1 
  case CC_A((_,'x'), _) => 2 
  case CC_B(_, _, CC_B(_, _, _)) => 3 
  case CC_B(_, (CC_D(_, _, _),CC_D(_, _, _)), CC_C()) => 4 
  case CC_B(_, _, CC_A(_, _)) => 5 
}
}
// This is not matched: (CC_B Boolean Boolean Wildcard Wildcard (T_A T_B T_B))
// This is not matched: (CC_A (CC_C Byte
//            T_A
//            (CC_A Wildcard (CC_A Wildcard Wildcard T_A) T_A)
//            Wildcard
//            Wildcard
//            (T_B Byte T_A))
//      (CC_A Wildcard Wildcard T_A)
//      T_A)