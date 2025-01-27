package Program_14 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: Boolean, b: T_B, c: (Char,T_B)) extends T_A
case class CC_B[B](a: T_A) extends T_B
case class CC_C(a: ((Byte,Int),(Byte,Byte)), b: T_B) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _), _) => 0 
  case CC_A(_, CC_C(_, _), ('x',CC_C(_, _))) => 1 
  case CC_A(_, _, (_,CC_C(_, _))) => 2 
  case CC_A(_, _, ('x',CC_C(_, _))) => 3 
  case CC_A(_, CC_C(_, _), (_,CC_C(_, _))) => 4 
  case CC_A(_, CC_C(_, _), ('x',CC_B(_))) => 5 
  case CC_A(_, CC_B(_), (_,CC_B(_))) => 6 
  case CC_A(_, _, ('x',CC_B(_))) => 7 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B Int Boolean (T_B Int (T_B Int Int)))