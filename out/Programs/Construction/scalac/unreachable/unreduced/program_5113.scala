package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[Byte, C]
case class CC_B(a: T_A[Byte, T_A[Byte, Boolean]], b: T_A[CC_A[Int], T_A[Byte, Int]], c: (T_A[Int, Byte],T_A[Byte, Boolean])) extends T_A[Byte, CC_A[T_A[Byte, Int]]]

val v_a: T_A[Byte, CC_A[T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, _) => 1 
}
}