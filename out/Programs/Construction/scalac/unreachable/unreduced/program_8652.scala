package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B[C]() extends T_B[(Char,Char), C]
case class CC_C[D](a: (Int,T_B[CC_A, CC_A]), b: T_B[(Char,Char), D]) extends T_B[(Char,Char), D]

val v_a: T_B[(Char,Char), Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((12,_), _) => 1 
}
}
// This is not matched: CC_C((_,_), _)