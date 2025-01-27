package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[T_A],T_A)) extends T_A
case class CC_B(a: T_B[T_B[CC_A]], b: T_A) extends T_B[T_B[CC_A]]
case class CC_C(a: (T_B[CC_A],T_B[T_A])) extends T_B[T_B[CC_A]]
case class CC_D(a: Byte, b: CC_C, c: (T_B[T_A],CC_B)) extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), _) => 0 
  case CC_B(CC_B(CC_C(_), _), _) => 1 
  case CC_B(CC_B(CC_D(_, _, _), _), _) => 2 
  case CC_B(CC_C((_,_)), _) => 3 
  case CC_B(CC_D(_, _, (_,_)), _) => 4 
  case CC_C((_,_)) => 5 
  case CC_D(_, _, (_,CC_B(_, _))) => 6 
}
}