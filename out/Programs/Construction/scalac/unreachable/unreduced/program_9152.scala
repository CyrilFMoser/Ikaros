package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,Byte), b: (T_A[(Char,Int), T_B],T_A[Int, T_B])) extends T_A[Int, C]
case class CC_B[D](a: T_A[Int, D], b: D) extends T_A[Int, D]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, (_,_)), _) => 0 
  case CC_B(CC_B(CC_B(_, _), _), _) => 1 
}
}
// This is not matched: CC_B(CC_B(CC_A(_, _), _), _)