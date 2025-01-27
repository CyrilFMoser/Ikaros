package Program_30 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_B[(Byte,Boolean), T_A], c: T_A) extends T_A
case class CC_B(a: T_B[(Byte,Boolean), Byte], b: T_B[T_A, T_A], c: ((Boolean,Int),Byte)) extends T_A
case class CC_C[C](a: (T_A,CC_B), b: C) extends T_B[T_B[CC_B, T_A], C]
case class CC_D[D, E]() extends T_B[T_B[D, T_A], D]

val v_a: T_B[T_B[CC_B, T_A], CC_B] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_C((CC_B(_, _, _),CC_B(_, _, _)), _) => 1 
  case CC_C((CC_A(_, _, _),CC_B(_, _, _)), CC_B(_, _, _)) => 2 
}
}
// This is not matched: (CC_D (CC_B T_A T_A T_A (T_B T_A T_A))
//      T_A
//      (T_B (T_B (CC_B T_A T_A T_A (T_B T_A T_A)) T_A)
//           (CC_B T_A T_A T_A (T_B T_A T_A))))
// This is not matched: (CC_B Char (T_B Char (Tuple T_A (CC_A T_A T_A T_A))))