package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Char],((Boolean,Byte),Int)), b: T_A[Byte]) extends T_A[Char]
case class CC_B(a: CC_A, b: CC_A) extends T_A[Char]
case class CC_C(a: CC_A, b: CC_A) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),(_,_)), _) => 0 
  case CC_A((CC_B(_, _),(_,_)), _) => 1 
  case CC_A((CC_C(_, _),(_,_)), _) => 2 
  case CC_B(_, _) => 3 
  case CC_C(CC_A(_, _), CC_A((_,_), _)) => 4 
}
}