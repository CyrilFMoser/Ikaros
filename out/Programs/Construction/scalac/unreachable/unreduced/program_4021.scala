package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: (T_B[Boolean],(Byte,Byte))) extends T_A[C]
case class CC_B[D](a: (T_A[Int],T_A[Byte]), b: T_A[D], c: D) extends T_A[D]
case class CC_C[E](a: CC_A[E]) extends T_A[E]
case class CC_D() extends T_B[Byte]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,(_,_))) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_, (_,_))) => 2 
}
}