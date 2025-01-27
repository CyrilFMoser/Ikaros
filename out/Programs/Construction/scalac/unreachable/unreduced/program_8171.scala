package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: Int, b: (T_B[(Boolean,Char), T_A],T_B[T_A, CC_A]), c: Int) extends T_A
case class CC_D[C](a: C, b: CC_C) extends T_B[CC_C, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, (_,_), _) => 2 
}
}