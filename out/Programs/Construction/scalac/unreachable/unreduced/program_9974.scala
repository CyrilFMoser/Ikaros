package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[(T_A[Boolean, Byte],T_A[Char, Byte]), Int]
case class CC_B[C](a: T_A[C, C], b: C, c: CC_A) extends T_A[(T_A[Boolean, Byte],T_A[Char, Byte]), Int]
case class CC_C(a: CC_B[(CC_A,(Char,Char))], b: CC_A) extends T_A[(T_A[Boolean, Byte],T_A[Char, Byte]), Int]

val v_a: T_A[(T_A[Boolean, Byte],T_A[Char, Byte]), Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_C(CC_B(_, (_,_), _), _) => 2 
}
}