package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean, b: (T_B[T_A],T_A)) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: (CC_A,(Char,Byte)), b: T_A) extends T_A
case class CC_D(a: CC_A, b: T_B[Char]) extends T_B[Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_A(_, _))) => 0 
  case CC_A(_, (_,CC_B(_))) => 1 
  case CC_A(_, (_,CC_C(_, _))) => 2 
  case CC_B(CC_A(_, _)) => 3 
  case CC_B(CC_B(CC_A(_, _))) => 4 
  case CC_B(CC_B(CC_B(_))) => 5 
  case CC_B(CC_B(CC_C(_, _))) => 6 
  case CC_B(CC_C((_,_), _)) => 7 
  case CC_C((CC_A(_, _),(_,_)), CC_A(_, _)) => 8 
  case CC_C((CC_A(_, _),(_,_)), CC_B(CC_A(_, _))) => 9 
  case CC_C((CC_A(_, _),(_,_)), CC_B(CC_B(_))) => 10 
  case CC_C((CC_A(_, _),(_,_)), CC_B(CC_C(_, _))) => 11 
  case CC_C((CC_A(_, _),(_,_)), CC_C((_,_), _)) => 12 
}
}