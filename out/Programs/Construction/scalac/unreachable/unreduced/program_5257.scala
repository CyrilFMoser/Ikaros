package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Int, Int],T_A[Byte, Int]), c: ((Char,Int),T_A[Boolean, Int])) extends T_A[Boolean, C]
case class CC_B[D](a: T_A[Boolean, D], b: D) extends T_A[Boolean, D]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, (_,_), (_,_)), _) => 1 
}
}
// This is not matched: CC_B(CC_B(_, _), _)