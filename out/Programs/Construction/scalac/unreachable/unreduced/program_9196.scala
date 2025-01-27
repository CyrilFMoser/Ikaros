package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B() extends T_B[CC_A, T_A]
case class CC_C() extends T_B[CC_A, T_A]
case class CC_D[C](a: (T_B[CC_A, T_A],T_B[(Char,Char), CC_A]), b: T_A, c: CC_B) extends T_B[CC_A, T_A]

val v_a: T_B[CC_A, T_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_D((CC_C(),_), _, _) => 2 
  case CC_D((CC_D(_, _, _),_), _, _) => 3 
}
}
// This is not matched: CC_D((CC_B(),_), _, _)