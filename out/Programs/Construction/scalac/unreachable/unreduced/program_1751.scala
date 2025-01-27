package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, Byte]
case class CC_B[D](a: (T_A[Int, Byte],Byte), b: (Char,T_A[Boolean, Byte]), c: D) extends T_A[D, Byte]
case class CC_C(a: T_A[CC_A[Char], CC_B[Byte]], b: Char) extends T_A[T_A[Byte, Byte], Byte]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_)) => 0 
  case CC_B(_, _, CC_B(_, _, _)) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_A(_)