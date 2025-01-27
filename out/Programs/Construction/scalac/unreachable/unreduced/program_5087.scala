package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_A) extends T_B[T_A]
case class CC_C(a: (T_B[(Boolean,Char)],T_B[T_A])) extends T_B[T_A]
case class CC_D(a: T_A, b: CC_B) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_C((_,CC_B(_))) => 1 
  case CC_C((_,CC_C(_))) => 2 
  case CC_C((_,CC_D(_, _))) => 3 
  case CC_D(CC_A(), CC_B(_)) => 4 
}
}