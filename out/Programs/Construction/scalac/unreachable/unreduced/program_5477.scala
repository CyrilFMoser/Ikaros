package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: (T_B[Boolean, Int],T_A)) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: CC_A) extends T_A
case class CC_D[C](a: CC_C, b: T_B[C, C], c: T_A) extends T_B[C, (CC_A,Char)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_A(_, _))) => 0 
  case CC_A(_, (_,CC_B())) => 1 
  case CC_A(_, (_,CC_C(_, _))) => 2 
  case CC_B() => 3 
  case CC_C(_, _) => 4 
}
}